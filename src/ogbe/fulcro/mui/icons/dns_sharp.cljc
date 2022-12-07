(ns ogbe.fulcro.mui.icons.dns-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DnsSharp" :default DnsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dns-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DnsSharp)))