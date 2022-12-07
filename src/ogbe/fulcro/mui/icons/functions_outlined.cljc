(ns ogbe.fulcro.mui.icons.functions-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FunctionsOutlined" :default FunctionsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-functions-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FunctionsOutlined)))