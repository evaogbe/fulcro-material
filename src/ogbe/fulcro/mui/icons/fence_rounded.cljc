(ns ogbe.fulcro.mui.icons.fence-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FenceRounded" :default FenceRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fence-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FenceRounded)))