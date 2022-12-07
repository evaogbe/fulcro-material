(ns ogbe.fulcro.mui.icons.panorama-vertical-select
  #?(:cljs (:require
            ["@mui/icons-material/PanoramaVerticalSelect" :default PanoramaVerticalSelect]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-panorama-vertical-select
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PanoramaVerticalSelect)))