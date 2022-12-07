(ns ogbe.fulcro.mui.icons.hdr-auto
  #?(:cljs (:require
            ["@mui/icons-material/HdrAuto" :default HdrAuto]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hdr-auto
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HdrAuto)))