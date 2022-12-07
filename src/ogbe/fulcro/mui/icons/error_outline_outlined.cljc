(ns ogbe.fulcro.mui.icons.error-outline-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ErrorOutlineOutlined" :default ErrorOutlineOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-error-outline-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ErrorOutlineOutlined)))