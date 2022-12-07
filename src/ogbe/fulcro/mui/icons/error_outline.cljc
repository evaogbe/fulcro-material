(ns ogbe.fulcro.mui.icons.error-outline
  #?(:cljs (:require
            ["@mui/icons-material/ErrorOutline" :default ErrorOutline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-error-outline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ErrorOutline)))