(ns ogbe.fulcro.mui.icons.domain-verification
  #?(:cljs (:require
            ["@mui/icons-material/DomainVerification" :default DomainVerification]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-domain-verification
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DomainVerification)))