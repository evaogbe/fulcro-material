(ns ogbe.fulcro.mui.icons.waves-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/WavesTwoTone" :default WavesTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-waves-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WavesTwoTone)))