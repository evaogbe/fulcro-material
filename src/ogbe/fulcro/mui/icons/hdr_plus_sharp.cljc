(ns ogbe.fulcro.mui.icons.hdr-plus-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HdrPlusSharp" :default HdrPlusSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hdr-plus-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HdrPlusSharp)))