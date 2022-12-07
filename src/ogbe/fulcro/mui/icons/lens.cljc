(ns ogbe.fulcro.mui.icons.lens
  #?(:cljs (:require
            ["@mui/icons-material/Lens" :default Lens]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lens
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Lens)))