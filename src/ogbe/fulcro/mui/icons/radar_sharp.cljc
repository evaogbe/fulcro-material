(ns ogbe.fulcro.mui.icons.radar-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RadarSharp" :default RadarSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-radar-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RadarSharp)))