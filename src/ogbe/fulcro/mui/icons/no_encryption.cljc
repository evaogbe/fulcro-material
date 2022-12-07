(ns ogbe.fulcro.mui.icons.no-encryption
  #?(:cljs (:require
            ["@mui/icons-material/NoEncryption" :default NoEncryption]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-encryption
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoEncryption)))