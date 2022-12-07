(ns ogbe.fulcro.mui.icons.pix-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PixSharp" :default PixSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pix-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PixSharp)))