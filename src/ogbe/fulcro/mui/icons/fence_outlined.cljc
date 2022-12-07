(ns ogbe.fulcro.mui.icons.fence-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FenceOutlined" :default FenceOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fence-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FenceOutlined)))