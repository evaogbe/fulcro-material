(ns ogbe.fulcro.mui.icons.hdr-plus
  #?(:cljs (:require
            ["@mui/icons-material/HdrPlus" :default HdrPlus]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hdr-plus
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HdrPlus)))