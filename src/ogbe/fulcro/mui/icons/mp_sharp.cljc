(ns ogbe.fulcro.mui.icons.mp-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MpSharp" :default MpSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mp-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MpSharp)))