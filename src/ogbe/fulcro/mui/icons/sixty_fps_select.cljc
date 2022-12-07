(ns ogbe.fulcro.mui.icons.sixty-fps-select
  #?(:cljs (:require
            ["@mui/icons-material/SixtyFpsSelect" :default SixtyFpsSelect]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sixty-fps-select
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SixtyFpsSelect)))