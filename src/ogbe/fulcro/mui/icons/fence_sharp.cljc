(ns ogbe.fulcro.mui.icons.fence-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FenceSharp" :default FenceSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fence-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FenceSharp)))