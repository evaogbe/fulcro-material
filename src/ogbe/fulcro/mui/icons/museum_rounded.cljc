(ns ogbe.fulcro.mui.icons.museum-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MuseumRounded" :default MuseumRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-museum-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MuseumRounded)))