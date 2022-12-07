(ns ogbe.fulcro.mui.icons.domain-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DomainSharp" :default DomainSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-domain-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DomainSharp)))