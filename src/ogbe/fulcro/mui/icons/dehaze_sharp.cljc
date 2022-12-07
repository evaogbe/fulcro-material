(ns ogbe.fulcro.mui.icons.dehaze-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DehazeSharp" :default DehazeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dehaze-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DehazeSharp)))