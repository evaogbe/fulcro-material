(ns ogbe.fulcro.mui.icons.panorama
  #?(:cljs (:require
            ["@mui/icons-material/Panorama" :default Panorama]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-panorama
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Panorama)))