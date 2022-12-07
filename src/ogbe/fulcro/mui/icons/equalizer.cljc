(ns ogbe.fulcro.mui.icons.equalizer
  #?(:cljs (:require
            ["@mui/icons-material/Equalizer" :default Equalizer]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-equalizer
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Equalizer)))