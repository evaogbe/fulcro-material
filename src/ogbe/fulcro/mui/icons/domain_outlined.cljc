(ns ogbe.fulcro.mui.icons.domain-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DomainOutlined" :default DomainOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-domain-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DomainOutlined)))