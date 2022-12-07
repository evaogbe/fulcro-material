(ns ogbe.fulcro.mui.icons.museum-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MuseumSharp" :default MuseumSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-museum-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MuseumSharp)))