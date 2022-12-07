(ns ogbe.fulcro.mui.icons.no-encryption-rounded
  #?(:cljs (:require
            ["@mui/icons-material/NoEncryptionRounded" :default NoEncryptionRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-encryption-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoEncryptionRounded)))