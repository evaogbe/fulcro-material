(ns ogbe.fulcro.mui.icons.voicemail
  #?(:cljs (:require
            ["@mui/icons-material/Voicemail" :default Voicemail]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-voicemail
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Voicemail)))