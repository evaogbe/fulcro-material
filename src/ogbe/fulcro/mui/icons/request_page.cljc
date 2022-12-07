(ns ogbe.fulcro.mui.icons.request-page
  #?(:cljs (:require
            ["@mui/icons-material/RequestPage" :default RequestPage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-request-page
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RequestPage)))