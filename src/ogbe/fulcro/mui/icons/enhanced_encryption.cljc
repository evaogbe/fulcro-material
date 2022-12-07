(ns ogbe.fulcro.mui.icons.enhanced-encryption
  #?(:cljs (:require
            ["@mui/icons-material/EnhancedEncryption" :default EnhancedEncryption]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-enhanced-encryption
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EnhancedEncryption)))