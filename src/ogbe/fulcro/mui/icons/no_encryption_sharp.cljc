(ns ogbe.fulcro.mui.icons.no-encryption-sharp
  #?(:cljs (:require
            ["@mui/icons-material/NoEncryptionSharp" :default NoEncryptionSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-encryption-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoEncryptionSharp)))