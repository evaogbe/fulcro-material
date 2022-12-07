(ns ogbe.fulcro.mui.icons.thirty-fps-select
  #?(:cljs (:require
            ["@mui/icons-material/ThirtyFpsSelect" :default ThirtyFpsSelect]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-thirty-fps-select
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThirtyFpsSelect)))