(ns ogbe.fulcro.mui.icons.hdr-strong
  #?(:cljs (:require
            ["@mui/icons-material/HdrStrong" :default HdrStrong]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hdr-strong
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HdrStrong)))