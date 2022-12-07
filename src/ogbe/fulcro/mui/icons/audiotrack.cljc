(ns ogbe.fulcro.mui.icons.audiotrack
  #?(:cljs (:require
            ["@mui/icons-material/Audiotrack" :default Audiotrack]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-audiotrack
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Audiotrack)))