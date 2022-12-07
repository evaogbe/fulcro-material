(ns ogbe.fulcro.mui.icons.done-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DoneOutlined" :default DoneOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-done-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoneOutlined)))