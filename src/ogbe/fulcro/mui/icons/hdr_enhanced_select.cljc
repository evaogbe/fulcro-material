(ns ogbe.fulcro.mui.icons.hdr-enhanced-select
  #?(:cljs (:require
            ["@mui/icons-material/HdrEnhancedSelect" :default HdrEnhancedSelect]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hdr-enhanced-select
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HdrEnhancedSelect)))