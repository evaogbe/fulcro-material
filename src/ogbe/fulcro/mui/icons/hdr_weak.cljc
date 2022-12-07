(ns ogbe.fulcro.mui.icons.hdr-weak
  #?(:cljs (:require
            ["@mui/icons-material/HdrWeak" :default HdrWeak]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hdr-weak
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HdrWeak)))