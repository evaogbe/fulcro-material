(ns ogbe.fulcro.mui.icons.piano-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PianoTwoTone" :default PianoTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-piano-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PianoTwoTone)))