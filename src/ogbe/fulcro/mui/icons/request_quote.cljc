(ns ogbe.fulcro.mui.icons.request-quote
  #?(:cljs (:require
            ["@mui/icons-material/RequestQuote" :default RequestQuote]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-request-quote
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RequestQuote)))