(ns ogbe.fulcro.mui.icons.deblur
  #?(:cljs (:require
            ["@mui/icons-material/Deblur" :default Deblur]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-deblur
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Deblur)))