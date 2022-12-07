(ns ogbe.fulcro.mui.icons.dns
  #?(:cljs (:require
            ["@mui/icons-material/Dns" :default Dns]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dns
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Dns)))