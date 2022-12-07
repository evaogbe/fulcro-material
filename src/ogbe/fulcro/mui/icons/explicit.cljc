(ns ogbe.fulcro.mui.icons.explicit
  #?(:cljs (:require
            ["@mui/icons-material/Explicit" :default Explicit]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-explicit
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Explicit)))