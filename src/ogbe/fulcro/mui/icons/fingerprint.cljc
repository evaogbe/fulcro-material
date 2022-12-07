(ns ogbe.fulcro.mui.icons.fingerprint
  #?(:cljs (:require
            ["@mui/icons-material/Fingerprint" :default Fingerprint]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fingerprint
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Fingerprint)))