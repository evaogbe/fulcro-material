(ns ogbe.fulcro.mui.icons.domain-disabled
  #?(:cljs (:require
            ["@mui/icons-material/DomainDisabled" :default DomainDisabled]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-domain-disabled
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DomainDisabled)))