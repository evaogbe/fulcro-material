(ns ogbe.fulcro.mui.icons.deblur-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DeblurSharp" :default DeblurSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-deblur-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeblurSharp)))