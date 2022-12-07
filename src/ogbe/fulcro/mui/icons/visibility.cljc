(ns ogbe.fulcro.mui.icons.visibility
  #?(:cljs (:require
            ["@mui/icons-material/Visibility" :default Visibility]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-visibility
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Visibility)))