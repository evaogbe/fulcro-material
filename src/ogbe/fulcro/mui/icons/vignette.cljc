(ns ogbe.fulcro.mui.icons.vignette
  #?(:cljs (:require
            ["@mui/icons-material/Vignette" :default Vignette]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-vignette
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Vignette)))