(ns ogbe.fulcro.mui.icons.nfc
  #?(:cljs (:require
            ["@mui/icons-material/Nfc" :default Nfc]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nfc
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Nfc)))