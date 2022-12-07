(ns ogbe.fulcro.mui.icons.error-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ErrorOutlined" :default ErrorOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-error-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ErrorOutlined)))