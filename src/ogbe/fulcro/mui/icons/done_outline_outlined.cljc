(ns ogbe.fulcro.mui.icons.done-outline-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DoneOutlineOutlined" :default DoneOutlineOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-done-outline-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoneOutlineOutlined)))