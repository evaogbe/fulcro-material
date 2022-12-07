(ns ogbe.fulcro.mui.icons.redo-outlined
  #?(:cljs (:require
            ["@mui/icons-material/RedoOutlined" :default RedoOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-redo-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RedoOutlined)))