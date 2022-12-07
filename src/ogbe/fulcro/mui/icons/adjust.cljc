(ns ogbe.fulcro.mui.icons.adjust
  #?(:cljs (:require
            ["@mui/icons-material/Adjust" :default Adjust]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-adjust
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Adjust)))