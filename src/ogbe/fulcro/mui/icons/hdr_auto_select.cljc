(ns ogbe.fulcro.mui.icons.hdr-auto-select
  #?(:cljs (:require
            ["@mui/icons-material/HdrAutoSelect" :default HdrAutoSelect]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hdr-auto-select
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HdrAutoSelect)))