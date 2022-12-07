(ns ogbe.fulcro.mui.icons.signpost
  #?(:cljs (:require
            ["@mui/icons-material/Signpost" :default Signpost]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-signpost
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Signpost)))