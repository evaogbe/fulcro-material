(ns ogbe.fulcro.mui.icons.party-mode
  #?(:cljs (:require
            ["@mui/icons-material/PartyMode" :default PartyMode]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-party-mode
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PartyMode)))